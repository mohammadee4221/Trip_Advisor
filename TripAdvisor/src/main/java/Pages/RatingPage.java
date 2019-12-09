package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;

public class RatingPage extends BaseTest {
	
	public RatingPage() {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how=How.CSS, using="#bubble_rating") WebElement selectRating;	
	 @FindBy(how=How.CSS, using="#ReviewTitle") WebElement ReviewTitle;
	 @FindBy(how=How.CSS, using="#ReviewText") WebElement ReviewText;	
	 @FindBy(how=How.CSS, using="#qid12_bubbles")WebElement ServiceRating;	
	 @FindBy(how=How.XPATH, using="//*[@id=\"qid11_bubbles\"]") WebElement RoomsRating;
	 @FindBy(how=How.XPATH, using="//*[@id=\"qid14_bubbles\"]") WebElement  CleanRating;	
	 @FindBy(how=How.XPATH, using="//*[@id=\"noFraud\"]") WebElement  SubmitYourView;	 
	 @FindBy(how=How.XPATH, using="//*[@id=\"SUBMIT\"]") WebElement  Submit;	
	 
	 public void provideRating() {
		 
		 new Actions(driver).moveToElement( selectRating).perform();
		 selectRating.click();
		 ReviewTitle.sendKeys("Club Mahindra Reviews");
		 ReviewText.sendKeys("Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri, offering a romantic environment alongside many helpful amenities designed to enhance your staClose to some of Madikeri's most popular landmarks, such as Raja's Tomb ( Gadhige)Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri, offering a romantic environment alongside many helpful amenities designed to enhance your stClose to some of Madikeri's most popular landmarks, such as Raja's Tomb ( Gadhige) (2.6 km) and Omkareshwara Temple (3.5 km), Club Mahindra Kodagu Valley Hotel is a great destination for tourists.Rooms at Club Mahindra Madikeri, Coorg provide a flat screen TV, a refrigerator, and a kitchenette, and guests can stay connected with internet access Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,	Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,Club Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,MahindraClub Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri, Madikeri, Coorg is anClub Mahindra Madikeri, Coorg is an Club Mahindra Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,excellent choice for travellers visiting Madikeri, excellent choice for travellers visiting Madikeri,Club Mahindra Madikeri, Coorg is an excellent choice for travellers visiting Madikeri,");
	 
	 }
	 
	 public void hotelrating() {
		 new Actions(driver).moveToElement( ServiceRating).perform();
		 ServiceRating.click();
	 }
	 
// 	 public void cleanRating() {
// 		 new Actions(driver).moveToElement( CleanRating).perform();
// 		 CleanRating.click();
// 	 }	 
// 	 public void  roomsRating() {
// 		 new Actions(driver).moveToElement( RoomsRating).perform();
// 	     RoomsRating.click();
// 	 }	 
	 public void sumbitReview()	{
		SubmitYourView.click();
		Submit.click();
		 
	 }
	 	 
}
