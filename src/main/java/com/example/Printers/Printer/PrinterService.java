package com.example.Printers.Printer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrinterService {

    private final PrinterRepository printerRepository;

    public PrinterService(PrinterRepository printerRepository) {
        this.printerRepository = printerRepository;
    }

    // create
    public Printer createPrinter(Printer printer) {
        return printerRepository.save(printer);
    }

    // read
    public Printer getPrinter(int id) {
        return printerRepository.findById(id).get();
    }

    // read all
    public List<Printer> getAllPrinters() {
        return printerRepository.findAll();
    }

    // update
    public Printer updatePrinter(Printer printer, int id) {
        Optional<Printer> optionalPrinter = printerRepository.findById(id);
        if (optionalPrinter.isPresent()) {
            Printer updatedPrinter = optionalPrinter.get();
            updatedPrinter.setBrand(printer.getBrand());
            updatedPrinter.setModel(printer.getModel());
            updatedPrinter.setTrays(printer.getTrays());
            updatedPrinter.setSingleFunction(printer.isSingleFunction());

            return printerRepository.save(updatedPrinter);
        } else {
            return null;
        }
    }

    // delete
    public String deletePrinter(int id) {
        printerRepository.deleteById(id);
        return "Printer deleted";
    }
}
