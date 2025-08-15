package com.example.bus_terminal.model;

public class Report {
    private String reportType;
    private String reportContent;

    public Report(String reportType, String reportContent) {
        this.reportType = reportType;
        this.reportContent = reportContent;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}

