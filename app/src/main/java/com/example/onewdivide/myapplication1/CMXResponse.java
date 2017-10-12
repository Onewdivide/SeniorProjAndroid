package com.example.onewdivide.myapplication1;

import java.util.List;

/**
 * Created by Onewdivide on 13/10/2560.
 */

public class CMXResponse {


    /**
     * macAddress : 78:4f:43:8a:db:ab
     * mapInfo : {"mapHierarchyString":"Ratchasuda College>Director Building>Director_FL.1","floorRefId":"730421014739025963","floorDimension":{"length":243.43831,"width":344.4882,"height":9.84252,"offsetX":0,"offsetY":2.296588,"unit":"FEET"},"image":{"imageName":"domain_0_1500368087062.jpg","zoomLevel":0,"width":0,"height":0,"size":0,"maxResolution":0,"colorDepth":0},"mapHierarchyDetails":{"campus":"Ratchasuda College","campusAesUid":730421014739025961,"building":"Director Building","buildingAesUid":730421014739025962,"floor":"Director_FL.1","floorAesUid":730421014739025963,"zones":null}}
     * mapCoordinate : {"x":205.15771,"y":107.87266,"z":0,"unit":"FEET"}
     * currentlyTracked : true
     * confidenceFactor : 288
     * statistics : {"currentServerTime":"2017-10-13T02:07:54.056+0700","firstLocatedTime":"2017-09-19T15:13:56.295+0700","lastLocatedTime":"2017-09-19T16:00:58.529+0700"}
     * historyLogReason : DISTANCE_CHANGE
     * geoCoordinate : null
     * rawLocation : null
     * networkStatus : ACTIVE
     * changedOn : 1505811658529
     * ipAddress : ["10.34.250.109","fe80:0000:0000:0000:0c96:c5e9:f899:8378"]
     * userName :
     * ssId : CMX-TEST
     * sourceTimestamp : 1505811658529
     * band : UNKNOWN
     * apMacAddress : 00:a3:8e:ce:4e:80
     * dot11Status : ASSOCIATED
     * manufacturer : null
     * areaGlobalIdList : null
     * detectingControllers : 10.34.250.13
     * bytesSent : 28851413
     * bytesReceived : 5215992
     * guestUser : false
     */

    private String macAddress;
    private MapInfoBean mapInfo;
    private MapCoordinateBean mapCoordinate;
    private boolean currentlyTracked;
    private int confidenceFactor;
    private StatisticsBean statistics;
    private String historyLogReason;
    private Object geoCoordinate;
    private Object rawLocation;
    private String networkStatus;
    private long changedOn;
    private String userName;
    private String ssId;
    private String sourceTimestamp;
    private String band;
    private String apMacAddress;
    private String dot11Status;
    private Object manufacturer;
    private Object areaGlobalIdList;
    private String detectingControllers;
    private int bytesSent;
    private int bytesReceived;
    private boolean guestUser;
    private List<String> ipAddress;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public MapInfoBean getMapInfo() {
        return mapInfo;
    }

    public void setMapInfo(MapInfoBean mapInfo) {
        this.mapInfo = mapInfo;
    }

    public MapCoordinateBean getMapCoordinate() {
        return mapCoordinate;
    }

    public void setMapCoordinate(MapCoordinateBean mapCoordinate) {
        this.mapCoordinate = mapCoordinate;
    }

    public boolean isCurrentlyTracked() {
        return currentlyTracked;
    }

    public void setCurrentlyTracked(boolean currentlyTracked) {
        this.currentlyTracked = currentlyTracked;
    }

    public int getConfidenceFactor() {
        return confidenceFactor;
    }

    public void setConfidenceFactor(int confidenceFactor) {
        this.confidenceFactor = confidenceFactor;
    }

    public StatisticsBean getStatistics() {
        return statistics;
    }

    public void setStatistics(StatisticsBean statistics) {
        this.statistics = statistics;
    }

    public String getHistoryLogReason() {
        return historyLogReason;
    }

    public void setHistoryLogReason(String historyLogReason) {
        this.historyLogReason = historyLogReason;
    }

    public Object getGeoCoordinate() {
        return geoCoordinate;
    }

    public void setGeoCoordinate(Object geoCoordinate) {
        this.geoCoordinate = geoCoordinate;
    }

    public Object getRawLocation() {
        return rawLocation;
    }

    public void setRawLocation(Object rawLocation) {
        this.rawLocation = rawLocation;
    }

    public String getNetworkStatus() {
        return networkStatus;
    }

    public void setNetworkStatus(String networkStatus) {
        this.networkStatus = networkStatus;
    }

    public long getChangedOn() {
        return changedOn;
    }

    public void setChangedOn(long changedOn) {
        this.changedOn = changedOn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSsId() {
        return ssId;
    }

    public void setSsId(String ssId) {
        this.ssId = ssId;
    }

    public String getSourceTimestamp() {
        return sourceTimestamp;
    }

    public void setSourceTimestamp(String sourceTimestamp) {
        this.sourceTimestamp = sourceTimestamp;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getApMacAddress() {
        return apMacAddress;
    }

    public void setApMacAddress(String apMacAddress) {
        this.apMacAddress = apMacAddress;
    }

    public String getDot11Status() {
        return dot11Status;
    }

    public void setDot11Status(String dot11Status) {
        this.dot11Status = dot11Status;
    }

    public Object getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Object manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Object getAreaGlobalIdList() {
        return areaGlobalIdList;
    }

    public void setAreaGlobalIdList(Object areaGlobalIdList) {
        this.areaGlobalIdList = areaGlobalIdList;
    }

    public String getDetectingControllers() {
        return detectingControllers;
    }

    public void setDetectingControllers(String detectingControllers) {
        this.detectingControllers = detectingControllers;
    }

    public int getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }

    public int getBytesReceived() {
        return bytesReceived;
    }

    public void setBytesReceived(int bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    public boolean isGuestUser() {
        return guestUser;
    }

    public void setGuestUser(boolean guestUser) {
        this.guestUser = guestUser;
    }

    public List<String> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    public static class MapInfoBean {
        /**
         * mapHierarchyString : Ratchasuda College>Director Building>Director_FL.1
         * floorRefId : 730421014739025963
         * floorDimension : {"length":243.43831,"width":344.4882,"height":9.84252,"offsetX":0,"offsetY":2.296588,"unit":"FEET"}
         * image : {"imageName":"domain_0_1500368087062.jpg","zoomLevel":0,"width":0,"height":0,"size":0,"maxResolution":0,"colorDepth":0}
         * mapHierarchyDetails : {"campus":"Ratchasuda College","campusAesUid":730421014739025961,"building":"Director Building","buildingAesUid":730421014739025962,"floor":"Director_FL.1","floorAesUid":730421014739025963,"zones":null}
         */

        private String mapHierarchyString;
        private String floorRefId;
        private FloorDimensionBean floorDimension;
        private ImageBean image;
        private MapHierarchyDetailsBean mapHierarchyDetails;

        public String getMapHierarchyString() {
            return mapHierarchyString;
        }

        public void setMapHierarchyString(String mapHierarchyString) {
            this.mapHierarchyString = mapHierarchyString;
        }

        public String getFloorRefId() {
            return floorRefId;
        }

        public void setFloorRefId(String floorRefId) {
            this.floorRefId = floorRefId;
        }

        public FloorDimensionBean getFloorDimension() {
            return floorDimension;
        }

        public void setFloorDimension(FloorDimensionBean floorDimension) {
            this.floorDimension = floorDimension;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public MapHierarchyDetailsBean getMapHierarchyDetails() {
            return mapHierarchyDetails;
        }

        public void setMapHierarchyDetails(MapHierarchyDetailsBean mapHierarchyDetails) {
            this.mapHierarchyDetails = mapHierarchyDetails;
        }

        public static class FloorDimensionBean {
            /**
             * length : 243.43831
             * width : 344.4882
             * height : 9.84252
             * offsetX : 0
             * offsetY : 2.296588
             * unit : FEET
             */

            private double length;
            private double width;
            private double height;
            private int offsetX;
            private double offsetY;
            private String unit;

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
                this.height = height;
            }

            public int getOffsetX() {
                return offsetX;
            }

            public void setOffsetX(int offsetX) {
                this.offsetX = offsetX;
            }

            public double getOffsetY() {
                return offsetY;
            }

            public void setOffsetY(double offsetY) {
                this.offsetY = offsetY;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }
        }

        public static class ImageBean {
            /**
             * imageName : domain_0_1500368087062.jpg
             * zoomLevel : 0
             * width : 0
             * height : 0
             * size : 0
             * maxResolution : 0
             * colorDepth : 0
             */

            private String imageName;
            private int zoomLevel;
            private int width;
            private int height;
            private int size;
            private int maxResolution;
            private int colorDepth;

            public String getImageName() {
                return imageName;
            }

            public void setImageName(String imageName) {
                this.imageName = imageName;
            }

            public int getZoomLevel() {
                return zoomLevel;
            }

            public void setZoomLevel(int zoomLevel) {
                this.zoomLevel = zoomLevel;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getMaxResolution() {
                return maxResolution;
            }

            public void setMaxResolution(int maxResolution) {
                this.maxResolution = maxResolution;
            }

            public int getColorDepth() {
                return colorDepth;
            }

            public void setColorDepth(int colorDepth) {
                this.colorDepth = colorDepth;
            }
        }

        public static class MapHierarchyDetailsBean {
            /**
             * campus : Ratchasuda College
             * campusAesUid : 730421014739025961
             * building : Director Building
             * buildingAesUid : 730421014739025962
             * floor : Director_FL.1
             * floorAesUid : 730421014739025963
             * zones : null
             */

            private String campus;
            private long campusAesUid;
            private String building;
            private long buildingAesUid;
            private String floor;
            private long floorAesUid;
            private Object zones;

            public String getCampus() {
                return campus;
            }

            public void setCampus(String campus) {
                this.campus = campus;
            }

            public long getCampusAesUid() {
                return campusAesUid;
            }

            public void setCampusAesUid(long campusAesUid) {
                this.campusAesUid = campusAesUid;
            }

            public String getBuilding() {
                return building;
            }

            public void setBuilding(String building) {
                this.building = building;
            }

            public long getBuildingAesUid() {
                return buildingAesUid;
            }

            public void setBuildingAesUid(long buildingAesUid) {
                this.buildingAesUid = buildingAesUid;
            }

            public String getFloor() {
                return floor;
            }

            public void setFloor(String floor) {
                this.floor = floor;
            }

            public long getFloorAesUid() {
                return floorAesUid;
            }

            public void setFloorAesUid(long floorAesUid) {
                this.floorAesUid = floorAesUid;
            }

            public Object getZones() {
                return zones;
            }

            public void setZones(Object zones) {
                this.zones = zones;
            }
        }
    }

    public static class MapCoordinateBean {
        /**
         * x : 205.15771
         * y : 107.87266
         * z : 0
         * unit : FEET
         */

        private double x;
        private double y;
        private int z;
        private String unit;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public int getZ() {
            return z;
        }

        public void setZ(int z) {
            this.z = z;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

    public static class StatisticsBean {
        /**
         * currentServerTime : 2017-10-13T02:07:54.056+0700
         * firstLocatedTime : 2017-09-19T15:13:56.295+0700
         * lastLocatedTime : 2017-09-19T16:00:58.529+0700
         */

        private String currentServerTime;
        private String firstLocatedTime;
        private String lastLocatedTime;

        public String getCurrentServerTime() {
            return currentServerTime;
        }

        public void setCurrentServerTime(String currentServerTime) {
            this.currentServerTime = currentServerTime;
        }

        public String getFirstLocatedTime() {
            return firstLocatedTime;
        }

        public void setFirstLocatedTime(String firstLocatedTime) {
            this.firstLocatedTime = firstLocatedTime;
        }

        public String getLastLocatedTime() {
            return lastLocatedTime;
        }

        public void setLastLocatedTime(String lastLocatedTime) {
            this.lastLocatedTime = lastLocatedTime;
        }
    }
}
