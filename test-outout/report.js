$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/saikiran/eclipse-workspace/cucumber_selenium/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "moolya login feature",
  "description": "",
  "id": "moolya-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "moolya login scenario test",
  "description": "",
  "id": "moolya-login-feature;moolya-login-scenario-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is moolya",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 68039392239,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.title_of_the_login_page_is_moolya()"
});
formatter.result({
  "duration": 16435865,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 399645279,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 37728825,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.user_verify_the_home_page()"
});
formatter.result({
  "duration": 28439059,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Chapters\u0027]\"}\n  (Session info: chrome\u003d67.0.3396.87)\n  (Driver info: chromedriver\u003d2.38.552518 (183d19265345f54ce39cbb94cf81ba5f15905011),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027rs-MAC15.local\u0027, ip: \u0027fe80:0:0:0:847:ebd3:132d:2a54%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00279.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552518 (183d19265345f54ce39cbb94cf81ba5f15905011), userDataDir\u003d/var/folders/g5/hz6k8ptx5xd4f1y9cf78s9600000gq/T/.org.chromium.Chromium.gmYDCX}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d67.0.3396.87, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 55910d1c03b96ff8601c2f02fedc9c91\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Chapters\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat stepDefinitions.loginStepDefinition.user_verify_the_home_page(loginStepDefinition.java:48)\n\tat ✽.Then user verify the home page(/Users/saikiran/eclipse-workspace/cucumber_selenium/src/main/java/Features/login.feature:9)\n",
  "status": "failed"
});
});