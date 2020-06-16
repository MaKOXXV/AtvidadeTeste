$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GravarProposta.feature");
formatter.feature({
  "line": 2,
  "name": "Service youtube",
  "description": "",
  "id": "service-youtube",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FluxoProposta"
    },
    {
      "line": 1,
      "name": "@GravarProposta"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "que acesso o youtube",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "pesquiso um video",
  "keyword": "And "
});
formatter.match({
  "location": "gravarProposta.queAcessoOYoutube()"
});
formatter.result({
  "duration": 7471001999,
  "status": "passed"
});
formatter.match({
  "location": "gravarProposta.pesquisoUmVideo()"
});
formatter.result({
  "duration": 10555370500,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d83.0.4103.97)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MLEMOS10\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mlemos\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50313}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 59bd7e926401128dadac3afff00afd96\n*** Element info: {Using\u003dxpath, value\u003d//form//*[@id\u003d\u0027search\u0027]}\r\n\tat sun.reflect.GeneratedConstructorAccessor11.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObject.GravarProposta.elementControl(GravarProposta.java:30)\r\n\tat pageObject.GravarProposta.youtPesquisa(GravarProposta.java:37)\r\n\tat steps.gravarProposta.pesquisoUmVideo(gravarProposta.java:32)\r\n\tat ✽.And pesquiso um video(GravarProposta.feature:6)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 8,
  "name": "vizualizar video",
  "description": "",
  "id": "service-youtube;vizualizar-video",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "curto o video",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "acessarei o video certo",
  "keyword": "Then "
});
formatter.match({
  "location": "gravarProposta.curtoOVideo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "gravarProposta.acessareiOVideoCerto()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2009127600,
  "status": "passed"
});
});