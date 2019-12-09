package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import Util.TestUtil;
import pages.RatingPage;
import pages.SearchPage;

public class SearchPageTest extends BaseTest{
	
	SearchPage searchPage;
	RatingPage ratingPage;
	TestUtil testUtil;
	
	public SearchPageTest(){
		super();		
	}	 
	 
	@BeforeMethod
	public void setUp() throws InterruptedException {				
		
		searchPage = new SearchPage();
		ratingPage = new RatingPage();
		testUtil = new TestUtil();
		
	}
	
	@Test(priority=0)
	public void searchClubMahindra(){
		
		searchPage.searchClub();
		testUtil.Scroll();
		searchPage.writeReview();
		testUtil.switchToWindow();
		ratingPage.provideRating();
		testUtil.Scroll();
		ratingPage.hotelrating();
		//ratingPage.cleanRating();
		//ratingPage.roomsRating();
		ratingPage.sumbitReview();
				
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();	
	}
}
