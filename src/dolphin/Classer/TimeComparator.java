package dolphin.Classer;
import java.sql.Time;
import java.util.*;

public class TimeComparator implements Comparator<Competition> {
  public int compare(Competition c1,Competition d2){
    Competition name1 = c1;
    Competition name2 = d2;

    if(c1.getRandomTimeRecord==d2.getRandomTimeRecord)
      return 0;
    else if(c1.getRandomTimeRecord.compareTo(name2.getRandomTimeRecord) > d2.getRandomTimeRecord.compareTo(name1.getRandomTimeRecord))
      return 1;
    else
      return -1;
  }
}