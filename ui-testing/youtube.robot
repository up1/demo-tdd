*** Settings ***
Library   SeleniumLibrary

*** Testcases ***
Search worldcup 2018
  เปิด browser ไปที่ youtube
  ใส่ keyword ว่า บอลโลก
  กดปุ่มค้นหา
  ต้องเจอข้อมูลของทีมอังกฤษ

*** Keywords ***
ใส่ keyword ว่า บอลโลก
  Input Text   id=search   บอลโลก

เปิด browser ไปที่ youtube
  Open Browser   https://www.youtube.com/   browser=chrome
  Capture Page Screenshot
