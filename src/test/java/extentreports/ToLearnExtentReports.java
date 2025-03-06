package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
@Test
public void createReport() {
	String timestamp = LocalDateTime.now().toString().replace(":","-");
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/"+timestamp+".html");
	ExtentReports extReport=new ExtentReports();
	extReport.attachReporter(spark);
	ExtentTest test = extReport.createTest("createReport");
	test.log(Status.PASS,"message added into report");
	test.log(Status.INFO,"adding info status");
	extReport.flush();
	
}
}
