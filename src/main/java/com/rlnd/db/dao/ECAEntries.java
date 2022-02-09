package com.rlnd.db.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.rlnd.db.model.request.RequestModel;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.TypeDef;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "ECA_ENTRIES")
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@TypeDef(name = "json", typeClass = JsonBinaryType.class)
@NoArgsConstructor
@ToString
public class ECAEntries {
    
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(name = "INCIDENT_TYPE")
    private String incidentType;

    @Column(name = "LAT")
    private String latitude;

    @Column(name = "LONG")
    private String longitude;

    @Column(name = "CREATED_DATE")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column
    private String status;

    public ECAEntries(RequestModel requestModel) {
        this.incidentType = requestModel.getIncidentType();
        this.latitude = requestModel.getLatitude();
        this.longitude = requestModel.getLongitude();
        this.status = requestModel.getStatus();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncidentType() {
        return this.incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
