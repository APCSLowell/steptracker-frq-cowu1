import java.util.ArrayList;
public class StepTracker
{
 private int minimumSteps;
 private int totalSteps;
 private int numActive;
 private int numDays;
} 
public StepTracker (int n)
 {
  minimumSteps = n;
  totalSteps = 0;
  numDays = 0;
  numActive = 0;
}
public void addDailySteps(int steps)
 { 
  totalSteps = steps + totalSteps;
  numDays++;
  if (numDays>=minimumSteps)
   numActive++;
}
public int activeDays()
 {
  return numActive;
}
public double averageSteps()
 {
 if(numDays == 0){
  return 0.0;
 } else
 { return (double) totalSteps/numDays;
 }
}
}
 
