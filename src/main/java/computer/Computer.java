package computer;

public class Computer {
    
    private String operatingSystem = "Linux";
    private double processTact = 2.4;
    private double hardDrive = 500;
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String newOperatingSystem) {
        this.operatingSystem = newOperatingSystem;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
    
    public void setProcessTact(double newProcessTact) {
        this.processTact = newProcessTact;
    }
    
    public double getHardDrive() {
        return this.processTact;
    }
    
    public void setHardDrive(double newHardDrive) {
        this.processTact = newHardDrive;
    }
    
    public Computer() {
        
    }
        
    public Computer(String operatingSystem, double processTact, double hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.hardDrive = hardDrive;
    }
    
}
