package dolphin.Classer;
import java.util.*;

public class TimeComparator implements Comparator<Competition> {

  public int compare(Competition competitorParameter1,Competition competitorParameter2){
    Competition competitor1 = competitorParameter1;
    Competition competitor2 = competitorParameter2;

    if(competitorParameter1.getRandomTimeRecord()==competitorParameter2.getRandomTimeRecord())
      return 0;
    else if(competitorParameter1.getRandomTimeRecord().compareTo(competitor2.getRandomTimeRecord())
        > competitorParameter2.getRandomTimeRecord().compareTo(competitor1.getRandomTimeRecord()))
      return 1;
    else
      return -1;
  }
}