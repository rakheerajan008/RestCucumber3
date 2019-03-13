Feature: Book
	Scenario: Title search
	Given I execute a API Place Holder with URL <url>
When the system returns a cookie
Then I get the response code <responseCode>
And the response body <responseBody>
| url	                                      | responseCode | responseBoby	                                  |
| " Http : // jsonplaceholder . Typicode . Com / posts " |	     200 	 | " Cheering  pleasure  takes  to  be  a " |
	 