*** Settings ***
Documentation  A resource file containing the application common specific keywords
Library  SeleniumLibrary


*** Variables ***

${Browser}  chrome

*** Keywords ***

Open Browser On
	[Arguments]  ${URL1}
	Open Browser  ${URL1}  ${BROWSER}
	Sleep  5 s
	
Go To Homepage
 	StartRecording

TearDown
	ClosesBrowser
	Close Browser 	


	