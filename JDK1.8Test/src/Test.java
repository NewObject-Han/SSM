import java.time.*;
/**
 * JDK1.8时间工具类
 * @author liang
 * @create 2020-11-26-18:06
 */
public class Test {
    public static void main(String[] args) {
        //取当前日期
        LocalDate today=LocalDate.now();
        System.out.println("today = " + today);
        //获取当前时间
        LocalTime time=LocalTime.now();
        System.out.println("time ="+time);

        //获取当前日期和时间
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("dateTime ="+dateTime);

      //获取带有时区的时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime ="+zonedDateTime);

        /*
        getYear()                         int        获取当前日期的年份
        getMonth()                        Month 获取当前日期的月份对象
        getMonthValue()                   int        获取当前日期是第几月
        getDayOfWeek()                    DayOfWeek  表示该对象表示的日期是星期几
        getDayOfMonth()                   int        表示该对象表示的日期是这个月第几天
        getDayOfYear()                    int        表示该对象表示的日期是今年第几天
        withYear(int year)                LocalDate  修改当前对象的年份
        withMonth(int month)              LocalDate  修改当前对象的月份
        withDayOfMonth(intdayOfMonth)     LocalDate  修改当前对象在当月的日期
        isLeapYear()                      boolean    是否是闰年
        lengthOfMonth()                   int        这个月有多少天
        lengthOfYear()                    int        该对象表示的年份有多少天（365或者366）
        plusYears(longyearsToAdd)         LocalDate  当前对象增加指定的年份数
        plusMonths(longmonthsToAdd)       LocalDate  当前对象增加指定的月份数
        plusWeeks(longweeksToAdd)         LocalDate  当前对象增加指定的周数
        plusDays(longdaysToAdd)           LocalDate  当前对象增加指定的天数
        minusYears(longyearsToSubtract)   LocalDate  当前对象减去指定的年数
        minusMonths(longmonthsToSubtract) LocalDate  当前对象减去注定的月数
        minusWeeks(longweeksToSubtract)   LocalDate  当前对象减去指定的周数
        minusDays(longdaysToSubtract)     LocalDate  当前对象减去指定的天数
        compareTo(ChronoLocalDateother)   int        比较当前对象和other对象在时间上的大小，返回值如果为正，则当前对象时间较晚，
        isBefore(ChronoLocalDateother)    boolean    比较当前对象日期是否在other对象日期之前
        isAfter(ChronoLocalDateother)     boolean    比较当前对象日期是否在other对象日期之后
        isEqual(ChronoLocalDateother)     boolean    比较两个日期对象是否相等*/
    }
}
