*** Settings ***
Documentation  A resource file containing the application common specific keywords
Library  SeleniumLibrary


*** Variables ***
${URL}  https://glo.globallogic.com/apps/glo/login
${BROWSER}  chrome

*** Keywords ***

Given I Am At Glo Login Page
	Open Browser  ${URL}  ${BROWSER}
 	Maximize Browser Window
 	
When I Login To Glo
	[Arguments]  ${user}  ${password}
	Input Text  id=login   ${user}
	Input Text  id=password  ${password}
	Press Key  id=password  \\13
	Sleep  10 s
	
When I Click Skip On Slide
	Element Should Be Visible  id=slideSkip
	Click Element  id=slideSkip 
	
Then I Am Logged In To Glo
	Element Should Be Visible  id=search

When I Click My Profile
	Element Should Be Visible  xpath=//*[@id="myNav"]/ul[1]/li[2]/a
	Click Element  xpath=//*[@id="myNav"]/ul[1]/li[2]/a
	
Then My Profile Page Is Opened
     Element Should Be Visible  xpath=//*[@id="profileTabs"]/li[1]/a
    
When I Navigate To Section 
#sections=
#1= Home 
#2= My Profile 
#3= Organization
#4= Communities
#5= Apps
	[Arguments]  ${leftsection}
	Element Should Be Visible  xpath=//*[@id="myNav"]/ul[1]/li[${leftsection}]/a  
	Click Element  xpath=//*[@id="myNav"]/ul[1]/li[${leftsection}]/a  
	
When I Search Profile
	[Arguments]  ${searchprofile}  
	Input Text  xpath=//*[@id="search"]   ${searchprofile}
	Press Key  xpath=//*[@id="search"]   \\13
	Sleep  9 s

Then I Am At Search Results Page
#not working
	Element Should Be Visible  xpath=//*[@id="search_results"]/div[1]/div/div/div[1]/div/h2/text()
	
When I Click Result
#Must receive Name.Surname Case sensitive.
	[Arguments]  ${resultname}
	Click Link  href=/users/profile/${resultname}
	

