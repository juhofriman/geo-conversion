(defproject lupapiste/geo-conversion "0.1.0"
  :description "epsg3067 to wgs84 conversion library"
  :url "http://www.solita.fi"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.geotools/gt-main "14.2"]
                 [org.geotools/gt-referencing "14.2"]
                 [org.geotools/gt-epsg-wkt "14.2"]]
  :aot :all
  :repositories [["osgeo" {:url "http://download.osgeo.org/webdav/geotools"}]])
