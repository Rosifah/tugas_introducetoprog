module main {
    requires java.base;
    exports com.clinic.main;

    requires patients;
    requires services;
}