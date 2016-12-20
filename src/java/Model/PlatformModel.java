/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author icarv
 */
@XmlRootElement
public class PlatformModel {
    private String name;
    private int KLOC;
    private String fileName;
    private String creationData;
    private int numMessages;
    private String projectName;
    private String starData;
    private int bugFixTime;
    private int numberOfUser;
    private int averageTimeUse;
    private String newMemberName;
    private String eventName;
    private String occurredDate;
    private String nameHardwareSupport1;
    private String nameHardwareSupport2;
    private int numberOfUsersGroups;
    private String nameDeveloper1;
    private String nameDeveloper2;
    private String techName1;
    private String techName2;
    private String planForCollapse;
    private String nameSupport1;
    private String nameSupport2;
    private String supportNaturalLanguages;
    private String nameDevTech1;
    private String nameDevTech2;
    private String haveDocumentation;

    public String getNameSupport1() {
        return nameSupport1;
    }

    public void setNameSupport1(String nameSupport1) {
        this.nameSupport1 = nameSupport1;
    }

    public String getNameSupport2() {
        return nameSupport2;
    }

    public void setNameSupport2(String nameSupport2) {
        this.nameSupport2 = nameSupport2;
    }

    public String getSupportNaturalLanguages() {
        return supportNaturalLanguages;
    }

    public void setSupportNaturalLanguages(String supportNaturalLanguages) {
        this.supportNaturalLanguages = supportNaturalLanguages;
    }

    public String getNameDevTech1() {
        return nameDevTech1;
    }

    public void setNameDevTech1(String nameDevTech1) {
        this.nameDevTech1 = nameDevTech1;
    }

    public String getNameDevTech2() {
        return nameDevTech2;
    }

    public void setNameDevTech2(String nameDevTech2) {
        this.nameDevTech2 = nameDevTech2;
    }

    public String getHaveDocumentation() {
        return haveDocumentation;
    }

    public void setHaveDocumentation(String haveDocumentation) {
        this.haveDocumentation = haveDocumentation;
    }
    

    public String getNameHardwareSupport1() {
        return nameHardwareSupport1;
    }

    public void setNameHardwareSupport1(String nameHardwareSupport1) {
        this.nameHardwareSupport1 = nameHardwareSupport1;
    }

    public String getNameHardwareSupport2() {
        return nameHardwareSupport2;
    }

    public void setNameHardwareSupport2(String nameHardwareSupport2) {
        this.nameHardwareSupport2 = nameHardwareSupport2;
    }

    public int getNumberOfUsersGroups() {
        return numberOfUsersGroups;
    }

    public void setNumberOfUsersGroups(int numberOfUsersGroups) {
        this.numberOfUsersGroups = numberOfUsersGroups;
    }

    public String getNameDeveloper1() {
        return nameDeveloper1;
    }

    public void setNameDeveloper1(String nameDeveloper1) {
        this.nameDeveloper1 = nameDeveloper1;
    }

    public String getNameDeveloper2() {
        return nameDeveloper2;
    }

    public void setNameDeveloper2(String nameDeveloper2) {
        this.nameDeveloper2 = nameDeveloper2;
    }

    public String getTechName1() {
        return techName1;
    }

    public void setTechName1(String techName1) {
        this.techName1 = techName1;
    }

    public String getTechName2() {
        return techName2;
    }

    public void setTechName2(String techName2) {
        this.techName2 = techName2;
    }

    public String getPlanForCollapse() {
        return planForCollapse;
    }

    public void setPlanForCollapse(String planForCollapse) {
        this.planForCollapse = planForCollapse;
    }
    

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOccurredDate() {
        return occurredDate;
    }

    public void setOccurredDate(String occurredDate) {
        this.occurredDate = occurredDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKLOC() {
        return KLOC;
    }

    public void setKLOC(int KLOC) {
        this.KLOC = KLOC;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCreationData() {
        return creationData;
    }

    public void setCreationData(String creationData) {
        this.creationData = creationData;
    }

    public int getNumMessages() {
        return numMessages;
    }

    public void setNumMessages(int numMessages) {
        this.numMessages = numMessages;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStarData() {
        return starData;
    }

    public void setStarData(String starData) {
        this.starData = starData;
    }

    public int getBugFixTime() {
        return bugFixTime;
    }

    public void setBugFixTime(int bugFixTime) {
        this.bugFixTime = bugFixTime;
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public void setNumberOfUser(int numberOfUser) {
        this.numberOfUser = numberOfUser;
    }

    public int getAverageTimeUse() {
        return averageTimeUse;
    }

    public void setAverageTimeUse(int averageTimeUse) {
        this.averageTimeUse = averageTimeUse;
    }

    public String getNewMemberName() {
        return newMemberName;
    }

    public void setNewMemberName(String newMemberName) {
        this.newMemberName = newMemberName;
    }
    
    
    
    
    
}
