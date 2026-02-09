package com.design.LLD.lldPractice.solid.interfacesegregation;

// Only what a printer needs. No scan/fax — clients that only print don't depend on those.
public interface Printer {
    void print(String doc);
}
