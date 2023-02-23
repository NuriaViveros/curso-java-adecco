package exampleinterfaces.patients;

import java.time.LocalDate;
import java.util.Objects;

public class MedicalVisit {
    private LocalDate dataVisit;
    private VisitType visitType;

    private Boolean beenPresent;

    private Boolean isActive;
    private String report;

    public MedicalVisit() {
    }

    public MedicalVisit(LocalDate dataVisit, VisitType visitType, Boolean beenPresent, Boolean isActive, String report) {
        this.dataVisit = dataVisit;
        this.visitType = visitType;
        this.beenPresent = beenPresent;
        this.isActive = isActive;
        this.report = report;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDate getDataVisit() {
        return dataVisit;
    }

    public void setDataVisit(LocalDate dataVisit) {
        this.dataVisit = dataVisit;
    }

    public VisitType getVisitType() {
        return visitType;
    }

    public void setVisitType(VisitType visitType) {
        this.visitType = visitType;
    }

    public Boolean getBeenPresent() {
        return beenPresent;
    }

    public void setBeenPresent(Boolean beenPresent) {
        this.beenPresent = beenPresent;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "MedicalVisit{" +
                "dataVisit=" + dataVisit +
                ", visitType=" + visitType +
                ", beenPresent=" + beenPresent +
                ", report='" + report + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalVisit that = (MedicalVisit) o;
        return Objects.equals(dataVisit, that.dataVisit) && visitType == that.visitType && Objects.equals(beenPresent, that.beenPresent) && Objects.equals(report, that.report);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataVisit, visitType, beenPresent, report);
    }
}

