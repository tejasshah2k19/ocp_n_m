package ocp_n_m;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateApiDemo {

	public static void main(String[] args) {
//		LocalDate
//		LocalTime
//		LocalDateTime
//		TimeZone
//		ZoneId

// 		Period
//		Duration
//		Instant

		Date d = new Date(); // util sql
		System.out.println(d);// today

		Calendar c = Calendar.getInstance();
		System.out.println(c);

		// date

		// time

		// datetime

		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		System.out.println(ldate.getDayOfMonth());
		System.out.println(ldate.getDayOfWeek());
		System.out.println(ldate.getMonthValue());
		System.out.println(ldate.getMonth());

		LocalDateTime ldt = LocalDateTime.now();
		LocalTime lt = LocalTime.now();

		System.out.println(lt);
		System.out.println(ldate);
		System.out.println(ldt);

		System.out.println(lt.plusMinutes(30));

//		LocalDate ds = LocalDate.now(clock)

		TimeZone ti = TimeZone.getDefault();
		System.out.println(ti);

		TimeZone tu = TimeZone.getTimeZone("America/Los_Angeles");
		System.out.println(tu);

		ZoneId zone = ZoneId.of("America/Los_Angeles");
		System.out.println(zone);

		TimeZone tu1 = TimeZone.getTimeZone(zone);
		System.out.println(tu1);

		Period p = Period.ofDays(0);
		System.out.println(p);
		System.out.println(p.addTo(LocalDate.now().plusDays(5)));

		System.out.println("28->");
		Period p28 = Period.ofDays(28);
		System.out.println(p28.addTo(LocalDate.now()));

		//

		// 5-5-2023
		// 31-5-2023
		// 5-> 3 payment-> per day 100 rs

		LocalDateTime startDate = LocalDateTime.of(2023, 5, 5, 0, 0).plusDays(2);
		LocalDateTime endDate = LocalDateTime.of(2023, 5, 31, 0, 0);
		System.out.println(Duration.between(endDate, startDate));

		Instant ci = Instant.now();
		System.out.println(ci);

		System.out.println(ci.plusSeconds(3600));

		// UTC -> 23-5-2023 5PM =>
//10+10 
		// 10+-5

	}

//winter  -- summer 
//7
	// 6->
	// 8
//5.30
	// 4.30
	// 10
}
