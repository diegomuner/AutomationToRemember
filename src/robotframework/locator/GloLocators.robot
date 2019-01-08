*** Variables ***

#LoginPage 

${loginfield}  id=login 
${passwordfield}  id=password

#Loggged In - Slide

${welcomeslideskip}  id=slideSkip

#Homepage

${searchfield}  id=search

#Left Nav Bar

${leftnavbarsection}  xpath=//*[@id="myNav"]/ul[1]/li[${leftsection}]/a 
${menuelementprofile}  xpath=//*[@id="myNav"]/ul[1]/li[2]/a