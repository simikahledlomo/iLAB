#Author: simikahledlomo@gmail.com

#Sending appliction through iLab website for the first available job in South Africa.
Feature: Send job Application

Scenario: Successfully sending job application to iLab via their website portal
Given IMS baseURL "https://www.ilabquality.com/" browser "chrome"
When The user clicks get in touch link
Then The user clicks careere link
Then The user clicks their location as South Africa
Then The user will select the first available job
Then The user will location the application form
Then The user will enter first name as "Simikahle"
Then The user will enter last name as "Dlomo"
Then The user will enter email as "Simikahledlomo@gmail.com"
Then The user will enter phone number generated
Then The user will enter massage as "I love automation testing"
Then The user will click button submit