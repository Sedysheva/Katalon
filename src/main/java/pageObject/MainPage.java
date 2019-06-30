package pageObject;

import javafx.event.WeakEventHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MainPage {

    private ChromeDriver driver;
    private Actions act;
    private JavascriptExecutor js;
    String strFirstWindowHandle;
    By katalonMenu = By.xpath("//div//li[2]//a[text()=\"Why Katalon?\"]");
    By apiTesting = By.xpath("//div[@class=\"content\"]//div[text()=\"API testing\"]");
    By webTesting = By.xpath("//div[@class=\"content\"]//div[text()=\"Web testing\"]");
    By mobileTesting = By.xpath("//div[@class=\"content\"]//div[text()=\"Mobile testing\"]");
    By katalonAnalytics = By.xpath("//div[@class=\"content\"]//div[text()=\"Katalon Analytics\"]");
    By katalonRecorder = By.xpath("//div[@class=\"content\"]//div[text()=\"Katalon Recorder\"]");
    By technologiesHeader = By.xpath("//div[@id=\"include-technology_matrix\"]/h1");
    By technologies = By.xpath("//div[@class=\"technology-matrix\"]//div[text()=\"Technologies\"]");
    By integrationsHeader = By.xpath("//div[@id=\"Integrations\"]//div[@class=\"slogan-1\"]");
    By integrations = By.xpath("//div[@class=\"one-content\"]//a[text()=\"Integrations\"]");
    By solutionsHeader = By.xpath("//h2[text()=\"Solutions\"]");
    By solutions = By.xpath("//div[@class=\"one-content\"]//a[text()=\"Solutions\"]");
    By environmentsHeader = By.xpath("//div[@id=\"Environments\"]//div[@class=\"slogan-1\"]");
    By enviroments = By.xpath("//div[@class=\"one-content\"]//a[text()=\"Environments\"]");
    By pluginsLink = By.xpath("//div[@class=\"store_link\"]");
    By pluginsPage = By.xpath("//img[@class=\"katalon-logo\"]");
    By communityLink = By.xpath("//li/a[@class=\"dropdown-toggle\"][text()=\"Community\"]");
    By communityPage = By.xpath("//img[@id=\"site-logo\"]");
    By docs = By.xpath("//li/a[@class=\"dropdown-toggle\"][text()=\"Docs\"]");
    By manualsPage = By.xpath("//a[text()=\"Manuals\"]");
    By manuals = By.xpath("//li[@class=\"col-xs-12 col-sm-12 col-md-6\"]//a[text()=\"Manuals\"]");
    By tutorials = By.xpath("//li[@class=\"col-xs-12 col-sm-12 col-md-6\"]//a[text()=\"Tutorials\"]");
    By tutorialsPage = By.xpath("//*[@id=\"jsTOCLeftNav\"]/li[2]/ul/li[2]/a");
    By sampleProjects = By.xpath("//li[@class=\"col-xs-12 col-sm-12 col-md-6\"]//a[text()=\"Sample Projects\"]");
    By sampleProjectsPage = By.xpath("//img[@class=\"logo\"]");
    By whatsNew = By.xpath("//li[@class=\"col-xs-12 col-sm-12 col-md-6\"]//a[text()=\"What’s New\"]");
    By whatsNewPage = By.xpath("//a[normalize-space(text())=\"What's new\"]");
    By videos = By.xpath("//li[@class=\"col-xs-12 col-sm-12 col-md-6\"]//a[text()=\"Videos\"]");
    By videosPage = By.xpath("//a[text()=\"Videos\"]");
    By fAQs = By.xpath("//li[@class=\"col-xs-12 col-sm-12 col-md-6\"]//a[text()=\"FAQs\"]");
    By faqsPage = By.xpath("//a[text()=\"FAQs\"]");
    By services = By.xpath("//a[text()=\"Services\"]");
    By support = By.xpath("//li[@class=\"col-xs-12 col-sm-12\"]//a[text()=\"Support\"]");
    By supportText = By.xpath("//h1[@class=\"title-block\"]");
    By training = By.xpath("//li[@class=\"col-xs-12 col-sm-12\"]//a[text()=\"Training\"]");
    By trainingText = By.xpath("//div[@class=\"header-level-1\"]");
    By searchField = By.xpath("//span[@id=\"search-icon\"]");
    By searchFieldText = By.xpath("//div[@class=\"input_search\"]");
    By gitIcon = By.xpath("//a[@href=\"https://github.com/katalon-studio\"]");
    By gitIconText = By.xpath("//h1[@class=\"org-name lh-condensed\"]");
    By company = By.xpath("//div[@class=\"dropdownMenuTop\"]");
    By aboutUs = By.xpath("//a[text()=\"About Us\"]");
    By partners = By.xpath("//*[@id=\"top-menu-info\"]/div/ul/li[5]/div/div/div[2]/a");
    By blog = By.xpath("//a[text()=\"Blog\"]");
    By caseStudies = By.xpath("//li/a[text()=\"Case Studies\"]");
    By webinars = By.xpath("//li/a[text()=\"Webinars\"]");
    By signOut = By.xpath("//*[@id=\"top-menu-info\"]/div/ul/li[1]/a");
    By loginText = By.xpath("//li[1]//a[text()=\"Login\"]");

    public MainPage(ChromeDriver driver) {
        this.driver=driver;
        act = new Actions(driver);
        js = (JavascriptExecutor)this.driver;
        strFirstWindowHandle = driver.getWindowHandle();
    }

    private void closeAllPages() {
        Set<String> setWindowHandles = driver.getWindowHandles();

        for(String strWindowHandle: setWindowHandles){
            if(!strWindowHandle.equals(strFirstWindowHandle)){
                driver.switchTo().window(strWindowHandle);
                driver.close();
            }
        }
        driver.switchTo().window(strFirstWindowHandle);
    }

    private void clickSubMenuWhyKatalon(By subMenuXPath) {
        WebElement menuWhyKatalon = driver.findElement(katalonMenu);
        WebElement subMenu = driver.findElement(subMenuXPath);
        act.moveToElement(menuWhyKatalon).perform();
        act.moveToElement(subMenu).perform();
        subMenu.click();
    }

    private void clickSubMenuDocs(By subMenuDocsXPath) {
        WebElement subMenuDocs = driver.findElement(docs);
        WebElement subMenu = driver.findElement(subMenuDocsXPath);
        act.moveToElement(subMenuDocs).perform();
        act.moveToElement(subMenu).perform();
        subMenu.click();
    }

    private void clickSubMenuServices(By subMenuServicesXPath) {
        WebElement subMenuServices = driver.findElement(services);
        WebElement subMenu = driver.findElement(subMenuServicesXPath);
        act.moveToElement(subMenuServices).perform();
        act.moveToElement(subMenu).perform();
        subMenu.click();
    }

    private void clickSearchField(By searchFieldXpath) {
        WebElement searchFieldIcon = driver.findElement(searchField);
        searchFieldIcon.click();
    }

    private void clickGitHubIcon(By gitHubXpath) {
        WebElement gitHubIcon = driver.findElement(gitIcon);
        gitHubIcon.click();
    }

    private void clickSubMenuCompany(By companyXpath) {
        WebElement companySubMenu = driver.findElement(company);
        WebElement subMenu = driver.findElement(companyXpath);
        act.moveToElement(companySubMenu).perform();
        act.moveToElement(subMenu).perform();
        companySubMenu.click();
        subMenu.click();
    }

    private void clickBlogLink(By blogLinkXpath) {
        WebElement blogLink = driver.findElement(blog);
        blogLink.click();
    }

    private void clickCaseStudiesLink(By caseStudiesXpath) {
        WebElement caseStudiesLink = driver.findElement(caseStudies);
        caseStudiesLink.click();
    }

    private void clickWebinarsLink(By webinarsLinkXpath) {
        WebElement webinarsLink = driver.findElement(webinars);
        webinarsLink.click();
    }

    private void clickSignOutLink(By signOutXpath) {
        WebElement signOutLink = driver.findElement(signOut);
        signOutLink.click();
    }

    private void scrollUp() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(katalonMenu));
    }

    public void switchToNewPage() {
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void goLogin(){
        WebElement login = driver.findElement(By.xpath("//li[1]//a[text()=\"Login\"]"));
        login.click();
    }

    public void clickApiTesting() {
        clickSubMenuWhyKatalon(apiTesting);
    }

    public void clickWebTesting() {
        clickSubMenuWhyKatalon(webTesting);
    }

    public void clickMobileTesting() {
        clickSubMenuWhyKatalon(mobileTesting);
    }

    public void clickKatalonAnalytics() {
        clickSubMenuWhyKatalon(katalonAnalytics);
    }

    public void clickKatalonRecorder() {
        clickSubMenuWhyKatalon(katalonRecorder);
    }

    public void clickTechnologies() {
        clickSubMenuWhyKatalon(technologies);
    }

    public void clickIntegrations() throws InterruptedException {
        clickSubMenuWhyKatalon(integrations);
        //scrollUp();
    }

    public void clickSolutions() throws InterruptedException {
        clickSubMenuWhyKatalon(solutions);
        scrollUp();
    }

    public void clickEnvironments() throws InterruptedException {
        clickSubMenuWhyKatalon(enviroments);
        scrollUp();
    }

    public void clickPlugins() {
        WebElement pluginsElement = driver.findElement(pluginsLink);
        pluginsElement.click();
        //closeAllPages();
    }

    public void clickCommunity() {
        WebElement communityElement = driver.findElement(communityLink);
        communityElement.click();
        //closeAllPages();
    }

    public void clickManuals() {
        clickSubMenuDocs(manuals);
        //closeAllPages();
    }

    public void clickTutorials() {
        clickSubMenuDocs(tutorials);
        //closeAllPages();
    }

    public void clickSampleProjects() {
        clickSubMenuDocs(sampleProjects);
        //closeAllPages();
    }

    public void clickWhatsNew() {
        clickSubMenuDocs(whatsNew);
        //closeAllPages();
    }

    public void clickVideos() {
        clickSubMenuDocs(videos);
        //closeAllPages();
    }

    public void clickFaqs() {
        clickSubMenuDocs(fAQs);
        //closeAllPages();
    }

    public void clickSupport() {
        clickSubMenuServices(support);
    }

    public void clickTraining() {
        clickSubMenuServices(training);
    }

    public void clickSearchFieldIcon() {
        clickSearchField(searchField);
    }

    public void clickGitIcon() {
        clickGitHubIcon(gitIcon);
        //closeAllPages();
    }

    public void clickAboutUs() {
        clickSubMenuCompany(aboutUs);
    }

    public void clickPartners() {
        clickSubMenuCompany(partners);
    }

    public void clickLinkBlog() {
        clickBlogLink(blog);
    }

    public void clickLinkCaseStudies() {
        clickCaseStudiesLink(caseStudies);
    }

    public void clickLinkWebinars() {
        clickWebinarsLink(webinars);
    }

    public void clickSignOut() {
        clickSignOutLink(signOut);
    }

    public String getSignOutText() {
        WebElement signOutElement = driver.findElement(signOut);
        return signOutElement.getText();
    }

    public String getTechnologiesText() {
        WebElement technologiesElement = driver.findElement(technologiesHeader);
        return technologiesElement.getText();
    }

    public String getIntegrationsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement integrationElement = driver.findElement(integrationsHeader);
        return integrationElement.getText();
    }

    public String getSolutionsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement solutionsElement = driver.findElement(solutionsHeader);
        return solutionsElement.getText();
    }

    public String getEnvironmentsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement environmentsElement = driver.findElement(environmentsHeader);
        return environmentsElement.getText();
    }

    public String getPluginsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement pluginsElement = driver.findElement(pluginsPage);
        return pluginsElement.getText();
    }

    public String getCommunityText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement communityElement = driver.findElement(communityPage);
        return communityElement.getText();
    }

    public String getManualsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement manualsElement = driver.findElement(manualsPage);
        return manualsElement.getText();
    }

    public String getTutorialsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement tutorialsElement = driver.findElement(tutorialsPage);
        return tutorialsElement.getText();
    }

    public String getSampleProjectsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        WebElement sampleProjectsElement = driver.findElement(sampleProjectsPage);
        return sampleProjectsElement.getText();
    }

    public String getWhatsNewText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        WebElement whatsNewElement = driver.findElement(whatsNewPage);
        return whatsNewElement.getText();
    }

    public String getVideosText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        WebElement videosElement = driver.findElement(videosPage);
        return videosElement.getText();
    }

    public String getFaqsText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        WebElement faqsElement = driver.findElement(faqsPage);
        return faqsElement.getText();
    }

    public String getSupportText() {
        WebElement supportElement = driver.findElement(supportText);
        return supportElement.getText();
    }

    public String getTrainingText() {
        WebElement trainingElement = driver.findElement(trainingText);
        return trainingElement.getText();
    }

    public String getSearchText() {
        WebElement searchElement = driver.findElement(searchFieldText);
        return searchElement.getText();
    }

    public String getGitText() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement gitElement = driver.findElement(gitIconText);
        return gitElement.getText();
    }

    public String getSignOutLogText() {
        WebElement signOutElement = driver.findElement(loginText);
        return signOutElement.getText();
    }

}
