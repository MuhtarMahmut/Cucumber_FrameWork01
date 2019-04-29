@UserStory01
  Feature: user should be able to search items from google

    # background runs before each scenario, (similar to @BeforeMethod in TestNg)
  #  Background: web environment


      # Scenario is a Test Case
      Scenario: user should be able to search books
        When user Enters 'books' and click search
        Then page titile should change


      Scenario: user should be able to search stocks
        When user Enters 'stocks' and click search
        Then page titile should change




