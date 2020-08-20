package com.validator;

import org.apache.commons.codec.digest.DigestUtils;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DESTool {
    private final static String DES = "DES";
    public final static String PASSWORD_SECRET = "`~1@##*&……#%gpo~!*^%#";

    /**
     * 加密
     * @param src
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
        // DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(DES);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
        // 正式执行加密操作
        return cipher.doFinal(src);
    }

    /**
     *
     * @param password 密码
     * @param key 加密字符串
     * @return
     */
    public final static String encrypt(String password, String key) {
        try {
            return byte2String(encrypt(password.getBytes(), key.getBytes()));
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * 字节转字符
     * @param b
     * @return
     */
    public static String byte2String(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
        }
        return hs.toUpperCase();
    }
    /**
     *
     * @param src 数据源
     * @param key 密钥，长度必须是8的倍数
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] src, byte[] key) throws Exception {
        // DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建一个DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);
        // 创建一个密匙工厂，然后用它把DESKeySpec对象转换成一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(DES);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

        // 正式执行解密操作
        return cipher.doFinal(src);
    }

    /**
     * 解密
     * @param data
     * @param key
     * @return
     */
    public final static String decrypt(String data, String key) {
        try {
            return new String(decrypt(String2byte(data.getBytes()), key.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 字符转字节
     * @param b
     * @return
     */
    public static byte[] String2byte(byte[] b) {
        if ((b.length % 2) != 0)
            throw new IllegalArgumentException("长度不是偶数");
        byte[] b2 = new byte[b.length / 2];
        for (int n = 0; n < b.length; n += 2) {
            String item = new String(b, n, 2);
            b2[n / 2] = (byte) Integer.parseInt(item, 16);
        }
        return b2;
    }


    public static String encryptMD5(String password, boolean toUpper) {
        try {
            String encodedPwd = DigestUtils.md5Hex(encryptSHA(password, toUpper)) ;
            if (toUpper)
                return encodedPwd.toUpperCase();
            return encodedPwd;
        } catch (Exception e) {
        }
        return null;
    }

    public static String encryptSHA(String strSrc, boolean toUpper) {
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance("SHA1");
            md.update(bt);
            strDes = byte2String(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        if (toUpper)
            return strDes.toUpperCase();
        return strDes;
    }


    public static void main(String[] args) {
        String encryptString = encrypt("1",PASSWORD_SECRET);
        System.out.println(encryptString);
        String desencryptString = decrypt(encryptString,PASSWORD_SECRET);
        System.out.println(desencryptString);
    }
}
