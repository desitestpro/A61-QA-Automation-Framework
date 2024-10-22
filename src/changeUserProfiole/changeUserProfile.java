package bin.changeUserProfiole;

import org.openqa.selenium.By;

public class changeUserProfile extends BaseTest {
   public void userProfile() {

       WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
       clickAvatarIcon();

       provideCurrentPassword("12345678");
       String randomName = generateRandomName("Desi");
       provideProfileName(randomname);

       WebElement actualProfileName = driver.findElement(By.id("inputProfileName"));
       Assert.assertEquals(actualProfileName.getText(), randomName);

       saveProfile();


   }

   private void provideCurrentPassword(String passwrd) {
       Webelement profilePass = driver.findElement(By.cssSelector("input[name='current_password']"));
               profilePass.clear();
               profilePass.sendKeys(...keysToSend:passwrd);
   }
   private void provideProfileName(String randomname) {
       WebElement ProfileName=driver.findElement(By.id("inputProfileName"));
}




