module services {
    requires java.base;
    exports com.clinic.services;

    requires patients;
}