package com.example.onewdivide.myapplication1;

import java.util.List;

/**
 * Created by Onewdivide on 23/11/2560.
 */

public class CurrentLocationResponse {


    /**
     * macAddress : 18:cf:5e:bb:22:48
     * mapInfo : {"mapHierarchyString":"Ratchasuda College>Director Building>Director_FL.1","floorRefId":"730421014739025963","floorDimension":{"length":243.43831,"width":344.4882,"height":9.84252,"offsetX":0,"offsetY":2.296588,"unit":"FEET"},"image":{"imageName":"domain_0_1500368087062.jpg","zoomLevel":6,"width":4963,"height":3508,"size":4963,"maxResolution":32,"colorDepth":8}}
     * mapCoordinate : {"x":145.39458,"y":191.58163,"z":0,"unit":"FEET"}
     * currentlyTracked : true
     * confidenceFactor : 72
     * statistics : {"currentServerTime":"2017-11-23T15:30:41.662+0700","firstLocatedTime":"2017-11-23T15:25:58.528+0700","lastLocatedTime":"2017-11-23T15:30:36.280+0700","maxDetectedRssi":{"apMacAddress":"00:a3:8e:d4:9f:e0","band":"IEEE_802_11_B","slot":2,"rssi":-60,"antennaIndex":0,"lastHeardInSeconds":0}}
     * historyLogReason : null
     * geoCoordinate : null
     * rawLocation : {"rawX":-999,"rawY":-999,"unit":"FEET"}
     * networkStatus : ACTIVE
     * changedOn : 1511425836280
     * ipAddress : ["10.34.249.243","fe80:0000:0000:0000:9d2d:a7a4:24e8:8358"]
     * userName :
     * ssId : INRC2017
     * sourceTimestamp : null
     * band : IEEE_802_11_B
     * apMacAddress : 00:a3:8e:d4:9f:e0
     * dot11Status : ASSOCIATED
     * manufacturer : Liteon
     * areaGlobalIdList : [19,3,2,1,20,21,17]
     * detectingControllers : 10.34.250.13
     * bytesSent : 1150
     * bytesReceived : 19246
     * guestUser : false
     */

    private String macAddress;
    private MapInfoBean mapInfo;
    private MapCoordinateBean mapCoordinate;
    private boolean currentlyTracked;
    private int confidenceFactor;
    private StatisticsBean statistics;
    private Object historyLogReason;
    private Object geoCoordinate;
    private RawLocationBean rawLocation;
    private String networkStatus;
    private long changedOn;
    private String userName;
    private String ssId;
    private Object sourceTimestamp;
    private String band;
    private String apMacAddress;
    private String dot11Status;
    private String manufacturer;
    private String detectingControllers;
    private int bytesSent;
    private int bytesReceived;
    private boolean guestUser;
    private List<String> ipAddress;
    private List<Integer> areaGlobalIdList;

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

    public Object getHistoryLogReason() {
        return historyLogReason;
    }

    public void setHistoryLogReason(Object historyLogReason) {
        this.historyLogReason = historyLogReason;
    }

    public Object getGeoCoordinate() {
        return geoCoordinate;
    }

    public void setGeoCoordinate(Object geoCoordinate) {
        this.geoCoordinate = geoCoordinate;
    }

    public RawLocationBean getRawLocation() {
        return rawLocation;
    }

    public void setRawLocation(RawLocationBean rawLocation) {
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

    public Object getSourceTimestamp() {
        return sourceTimestamp;
    }

    public void setSourceTimestamp(Object sourceTimestamp) {
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public List<Integer> getAreaGlobalIdList() {
        return areaGlobalIdList;
    }

    public void setAreaGlobalIdList(List<Integer> areaGlobalIdList) {
        this.areaGlobalIdList = areaGlobalIdList;
    }

    public static class MapInfoBean {
        /**
         * mapHierarchyString : Ratchasuda College>Director Building>Director_FL.1
         * floorRefId : 730421014739025963
         * floorDimension : {"length":243.43831,"width":344.4882,"height":9.84252,"offsetX":0,"offsetY":2.296588,"unit":"FEET"}
         * image : {"imageName":"domain_0_1500368087062.jpg","zoomLevel":6,"width":4963,"height":3508,"size":4963,"maxResolution":32,"colorDepth":8}
         */

        private String mapHierarchyString;
        private String floorRefId;
        private FloorDimensionBean floorDimension;
        private ImageBean image;

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
             * zoomLevel : 6
             * width : 4963
             * height : 3508
             * size : 4963
             * maxResolution : 32
             * colorDepth : 8
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
    }

    public static class MapCoordinateBean {
        /**
         * x : 145.39458
         * y : 191.58163
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
         * currentServerTime : 2017-11-23T15:30:41.662+0700
         * firstLocatedTime : 2017-11-23T15:25:58.528+0700
         * lastLocatedTime : 2017-11-23T15:30:36.280+0700
         * maxDetectedRssi : {"apMacAddress":"00:a3:8e:d4:9f:e0","band":"IEEE_802_11_B","slot":2,"rssi":-60,"antennaIndex":0,"lastHeardInSeconds":0}
         */

        private String currentServerTime;
        private String firstLocatedTime;
        private String lastLocatedTime;
        private MaxDetectedRssiBean maxDetectedRssi;

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

        public MaxDetectedRssiBean getMaxDetectedRssi() {
            return maxDetectedRssi;
        }

        public void setMaxDetectedRssi(MaxDetectedRssiBean maxDetectedRssi) {
            this.maxDetectedRssi = maxDetectedRssi;
        }

        public static class MaxDetectedRssiBean {
            /**
             * apMacAddress : 00:a3:8e:d4:9f:e0
             * band : IEEE_802_11_B
             * slot : 2
             * rssi : -60
             * antennaIndex : 0
             * lastHeardInSeconds : 0
             */

            private String apMacAddress;
            private String band;
            private int slot;
            private int rssi;
            private int antennaIndex;
            private int lastHeardInSeconds;

            public String getApMacAddress() {
                return apMacAddress;
            }

            public void setApMacAddress(String apMacAddress) {
                this.apMacAddress = apMacAddress;
            }

            public String getBand() {
                return band;
            }

            public void setBand(String band) {
                this.band = band;
            }

            public int getSlot() {
                return slot;
            }

            public void setSlot(int slot) {
                this.slot = slot;
            }

            public int getRssi() {
                return rssi;
            }

            public void setRssi(int rssi) {
                this.rssi = rssi;
            }

            public int getAntennaIndex() {
                return antennaIndex;
            }

            public void setAntennaIndex(int antennaIndex) {
                this.antennaIndex = antennaIndex;
            }

            public int getLastHeardInSeconds() {
                return lastHeardInSeconds;
            }

            public void setLastHeardInSeconds(int lastHeardInSeconds) {
                this.lastHeardInSeconds = lastHeardInSeconds;
            }
        }
    }

    public static class RawLocationBean {
        /**
         * rawX : -999
         * rawY : -999
         * unit : FEET
         */

        private int rawX;
        private int rawY;
        private String unit;

        public int getRawX() {
            return rawX;
        }

        public void setRawX(int rawX) {
            this.rawX = rawX;
        }

        public int getRawY() {
            return rawY;
        }

        public void setRawY(int rawY) {
            this.rawY = rawY;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }
}
