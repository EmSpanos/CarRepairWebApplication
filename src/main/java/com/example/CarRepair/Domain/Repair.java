package com.example.CarRepair.Domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

//The Repair Entity

@Entity
@Table(name = "repairs")
public class Repair implements Serializable {

        //columns of Repair Entity
        //primary key autoincrement
        @Id
        @Column(name = "repairid", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long repairID;


        @Column(name = "description", length = 255)
        private String description;


        @Column(name = "dayofrepair")
        private Date dayOfRepair;


        @Column(name = "repairstatus", length =30)
        private String repairStatus;


        @Column(name = "repairtype", length = 30)
        private String repairType;

        @Column(name="servicecost",precision=10, scale=2)
        private Double serviceCost;

        @Column(name = "platenumber",length = 8)
        private String plateNumber;

        //The relationship between entities
        //one User->Many Repairs
        //foreight key : UserID
        @ManyToOne(optional=false)
        @JoinColumn(name="userid",referencedColumnName="userid")
        private User user;


        //Constructors


        public Repair() {
        }

        public Repair(Long repairID, String description, Date dayOfRepair, String repairStatus, String repairType, Double serviceCost, String plateNumber) {
                this.repairID = repairID;
                this.description = description;
                this.dayOfRepair = dayOfRepair;
                this.repairStatus = repairStatus;
                this.repairType = repairType;
                this.serviceCost = serviceCost;
                this.plateNumber = plateNumber;
        }

        public Repair(Long repairID, String description, Date dayOfRepair, String repairStatus, String repairType, Double serviceCost, String plateNumber, User user) {
                this.repairID = repairID;
                this.description = description;
                this.dayOfRepair = dayOfRepair;
                this.repairStatus = repairStatus;
                this.repairType = repairType;
                this.serviceCost = serviceCost;
                this.plateNumber = plateNumber;
                this.user = user;
        }


//Getters/Setters

        public Long getRepairID() {
                return repairID;
        }

        public void setRepairID(Long repairID) {
                this.repairID = repairID;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Date getDayOfRepair() {
                return dayOfRepair;
        }

        public void setDayOfRepair(Date dayOfRepair) {
                this.dayOfRepair = dayOfRepair;
        }

        public String getRepairStatus() {
                return repairStatus;
        }

        public void setRepairStatus(String repairStatus) {
                this.repairStatus = repairStatus;
        }

        public String getRepairType() {
                return repairType;
        }

        public void setRepairType(String repairType) {
                this.repairType = repairType;
        }

        public Double getServiceCost() {
                return serviceCost;
        }

        public void setServiceCost(Double serviceCost) {
                this.serviceCost = serviceCost;
        }

        public String getPlateNumber() {
                return plateNumber;
        }

        public void setPlateNumber(String plateNumber) {
                this.plateNumber = plateNumber;
        }


        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }


        //print all values of Repair Entity


        @Override
        public String toString() {

                return "Repair{" +

                        "RepairID=" + repairID +

                        ", Description=" + description +

                        ", DayOfRepair='" + dayOfRepair + '\'' +

                        ", RepairStatus='" + repairStatus + '\'' +

                        ", RepairType='" + repairType + '\'' +

                        ", ServiceCost='" + serviceCost + '\'' +



                        ", PlateNumber='" + plateNumber + '\'' +

                        ", PlateNumber='" + plateNumber + '\'' +

                        '}';

        }




}

