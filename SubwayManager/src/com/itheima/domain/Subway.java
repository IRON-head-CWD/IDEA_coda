package com.itheima.domain;

public class Subway {
    private String subwayID;
    private String subwayName;
    private String subwayRoad;

    public Subway() {
    }

    public Subway(String subwayID, String subwayName, String subwayRoad) {
        this.subwayID = subwayID;
        this.subwayName = subwayName;
        this.subwayRoad = subwayRoad;
    }

    public String getSubwayID() {
        return subwayID;
    }

    public void setSubwayID(String subwayID) {
        this.subwayID = subwayID;
    }

    public String getSubwayName() {
        return subwayName;
    }

    public void setSubwayName(String subwayName) {
        this.subwayName = subwayName;
    }

    public String getSubwayRoad() {
        return subwayRoad;
    }

    public void setSubwayRoad(String subwayRoad) {
        this.subwayRoad = subwayRoad;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "subwayID='" + subwayID + '\'' +
                ", subwayName='" + subwayName + '\'' +
                ", subwayRoad='" + subwayRoad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subway subway = (Subway) o;

        if (subwayID != null ? !subwayID.equals(subway.subwayID) : subway.subwayID != null) return false;
        if (subwayName != null ? !subwayName.equals(subway.subwayName) : subway.subwayName != null) return false;
        return subwayRoad != null ? subwayRoad.equals(subway.subwayRoad) : subway.subwayRoad == null;
    }

    @Override
    public int hashCode() {
        int result = subwayID != null ? subwayID.hashCode() : 0;
        result = 31 * result + (subwayName != null ? subwayName.hashCode() : 0);
        result = 31 * result + (subwayRoad != null ? subwayRoad.hashCode() : 0);
        return result;
    }
}
