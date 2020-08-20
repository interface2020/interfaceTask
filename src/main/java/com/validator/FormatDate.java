package com.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FormatDate {
	public static final String format1 = "yyyyMMddHHmmss";
	
	/**
	 * @category 将字符串dateStr根据format 转换的格式Date
	 * @param dateStr 要转换的字符串
	 * @param format 转换的格式
	 * @return 转换后的数据
	 * */
	public static Date stringToDateByFormat(String dateStr, String format) {
		if (dateStr == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param date 要转换的对象
	 * @param formatStr 转换的格式
	 * @return 转换后的数据
	 * */
	public static String toDateByFormat(Date date, String formatStr) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		return format.format(date);
	}
	
	/**
	 * @param date 要转换的对象
	 * @param format 转换的格式
	 * @return 转换后的数据
	 * */
	public static String toDateByFormat(Date date,SimpleDateFormat format) {
		if (date == null) {
			return null;
		}
		return format.format(date);
	}
	
	/** 转换日期为年月.
	 * @param Date 
	 * @return String yyyyMM
	 */
	public static String toYearMonth(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		return sdf.format(d);
	}

	/** 转换日期为短日期格式的字符串.
	 * @param Date 
	 * @return String yyyy-MM-dd
	 */
	public static String toShortFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(d);
	}
	/**
	 * 转换日期为留秒格式的字符串.
	 * @param Date
	 * @return yyyy-MM-dd HH:mm
	 */
	public static String toHourMinFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(d);
	}
	/** 转换日期为短日期格式的字符串.
	 * @param Date 
	 * @return String yyyy-MM-dd
	 */
	public static String toStrShortFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(d);
	}
	
	
	/** 转换日期为短日期格式的字符串.
	 * @param Date 
	 * @return String yyyy-MM-dd
	 */
	public static String toNYShortFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
		return sdf.format(d);
	}
	public static String NYShortFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		return sdf.format(d);
	}

	/** 转换日期为全日期格式的字符串.
	 * @param Date 
	 * @return String yyyy-MM-dd HH:mm:ss
	 */
	public static String toFullFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(d);
	}
	
	/** 转换日期为月日格式的字符串.
	 * @param Date 
	 * @return String yyyy-MM-dd HH:mm:ss
	 */
	public static String toMonthDayFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		return sdf.format(d);
	}
	
	/** 转换日期为时间格式的字符串.
	 * @param Date 
	 * @return String HH:mm:ss
	 */
	public static String toTimeFormat(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(d);
	}
	static String[] weeks = { "日", "一", "二", "三", "四", "五", "六" };
	/** 得当某个日期是那个月的第几周.
	 * @param Date 
	 * @return String YYYY年MM月  第week周
	 */
	public static String toMonthWeekFormat(final Date d) {
		if (d == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		String str = FormatDate.NYShortFormat(d);
		return str + " [第"+weeks[calendar.get(Calendar.WEEK_OF_MONTH)]+"周]";
	}
//	static String[] weeks = { "日", "一", "二", "三", "四", "五", "六" };
	/** 得当某个日期是那个月的星期几.
	 * @param Date 
	 * @return String YYYY年MM月dd日  星期
	 */
	public static String toWeekDayFormat(final Date d) {
		if (d == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		String str = FormatDate.toShortFormat(d);
		return str + " [星期"+ weeks[calendar.get(Calendar.DAY_OF_WEEK)-1]+"]";
	}
	
	/** 
     * 获取某年第一天日期 
     * @param year 年份 
     * @return Date 
     */  
    public static Date getYearFirst(int year){  
        Calendar calendar = Calendar.getInstance();  
        calendar.clear();  
        calendar.set(Calendar.YEAR, year);  
        Date currYearFirst = calendar.getTime();  
        return currYearFirst;  
    }
	
	/** 
     * 获取当年的第一天 
     * @param year 
     * @return 
     */  
    public static Date getCurrYearFirst(){  
        Calendar currCal=Calendar.getInstance();    
        int currentYear = currCal.get(Calendar.YEAR);  
        return getYearFirst(currentYear);  
    }  
    /**
     * 日期操作，返回给定日期相差v秒的时间（v为正则往后,为负则往前 ）
     *
     * @Title: dateWithSecondOption 
     * @param date
     * @param v
     * @return Date
     */
    public static Date dateWithSecondOption(Date date, Integer v) {
    	GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(Calendar.SECOND, v);
		return gc.getTime();
    }
    
    
    /**
     * 传入字符串时间获取季度（用户表季度切分之后判断改时间属于哪个季度）
     * @param dateStr
     * @return
     */
	public static String getQuarterByStringDate(String dateStr) {
		if (dateStr == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		try {
			Date date = sdf.parse(dateStr);//要判断的时间
			Date nowDate = new Date();//系统当前时间
			String nowYyMm = sdf.format(nowDate);//系统时间年月
			String yYMm = sdf.format(date);//检测时间年月
			if(nowYyMm.equals(yYMm)) {//检查时间在系统时间当月
				return "";
			}
			//系统时间减去一个月
			Calendar calendar = Calendar.getInstance();//日历对象
			calendar.setTime(nowDate);//设置当前日期
			calendar.add(Calendar.MONTH, -1);//月份减一
			nowYyMm = sdf.format(calendar.getTime());//系统时间年月
			if(nowYyMm.equals(yYMm)) {//检查时间在系统时间前一个月
				return "";
			}
			
			//获取检测时间属于哪个季度
			int season = getSeason(date);
			calendar.setTime(date);//设置当前日期
			return calendar.get(Calendar.YEAR)+""+season;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static List<String> getOrderTime2sByTwoTime(String startTime,String endTime) {
		List<String> list = new ArrayList<String>();
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
			Date startDate = sdf.parse(startTime);
			Date endDate = sdf.parse(endTime);
			
			Calendar calendar = Calendar.getInstance();//日历对象
			calendar.setTime(startDate);//设置当前日期
			while(calendar.getTime().getTime() <= endDate.getTime()){
				String quarter = getQuarterByDate(calendar.getTime());
				if(map.get(quarter)==null){
					map.put(quarter, quarter);
					list.add(quarter);
				}
				calendar.add(Calendar.MONTH, 1);//月份加一
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
     * 传入字符串时间获取季度（用户表季度切分之后判断改时间属于哪个季度）
     * @param dateStr
     * @return
     */
	public static String getQuarterByDate(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		try {
			Date nowDate = new Date();//系统当前时间
			String nowYyMm = sdf.format(nowDate);//系统时间年月
			String yYMm = sdf.format(date);//检测时间年月
			if(nowYyMm.equals(yYMm)) {//检查时间在系统时间当月
				return "";
			}
			//系统时间减去一个月
			Calendar calendar = Calendar.getInstance();//日历对象
			calendar.setTime(nowDate);//设置当前日期
			calendar.add(Calendar.MONTH, -1);//月份减一
			nowYyMm = sdf.format(calendar.getTime());//系统时间年月
			if(nowYyMm.equals(yYMm)) {//检查时间在系统时间前一个月
				return "";
			}
			
			//获取检测时间属于哪个季度
			int season = getSeason(date);
			calendar.setTime(date);//设置当前日期
			return calendar.get(Calendar.YEAR)+""+season;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/** 
     *  
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度 
     *  
     * @param date 
     * @return 
     */  
    public static int getSeason(Date date) {  
  
        int season = 0;  
  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int month = c.get(Calendar.MONTH);  
        switch (month) {  
        case Calendar.JANUARY:  
        case Calendar.FEBRUARY:  
        case Calendar.MARCH:  
            season = 1;  
            break;  
        case Calendar.APRIL:  
        case Calendar.MAY:  
        case Calendar.JUNE:  
            season = 2;  
            break;  
        case Calendar.JULY:  
        case Calendar.AUGUST:  
        case Calendar.SEPTEMBER:  
            season = 3;  
            break;  
        case Calendar.OCTOBER:  
        case Calendar.NOVEMBER:  
        case Calendar.DECEMBER:  
            season = 4;  
            break;  
        default:  
            break;  
        }  
        return season;  
    }
    
    /* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    
    /** 转换日期为年月.
	 * @param Date 
	 * @return String yyyyMMddHHmmss
	 */
	public static String toymdHMS(final Date d) {
		if (d == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(d);
	}
    
}