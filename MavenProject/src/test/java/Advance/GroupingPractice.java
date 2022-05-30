package Advance;

import org.testng.annotations.Test;

public class GroupingPractice {
  @Test(groups="Smoke")
  public void Vaishali() {
	  System.out.println("Flower samje kya...Fire hai mai");
  }
  @Test(groups="Sanity")
  public void Tilakraj() {
	  System.out.println("Kya baat hai");
  }
  @Test(groups="Smoke")
  public void Yuvraj() {
	  System.out.println("Sir ji,,, samajla ka");
  }
  @Test(groups="Regression")
  public void Dipam() {
	  System.out.println("Chatur....tussi great ho");
  }
}
