// Part A
public static int numberOfLeapYears(int year1, int year2)
{
  int count = 0;
  for (int y = year1; y <= year2; y++){
    if (isLeapYear(y)){
      count++;
    }
  }
  return count;
}

// Part B
public static int dayOfWeek(int month, int day, int year)
{
  int startDay = firstDayOfYear(year);
  int nthDay = dayOfYear(month, day, year);
  int returnDay = (startDay + nthDay - 1) % 7;
  return returnDay;
}
