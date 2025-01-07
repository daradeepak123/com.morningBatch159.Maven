package reportsAndLogs;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            sparkReporter = new ExtentSparkReporter("./reports/ExtentReport.html");
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("Automation Test Report");
            sparkReporter.config().setReportName("Extent Reports with Listeners");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        return extent;
    }
}
