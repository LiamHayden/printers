package com.example.Printers.Printer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Printers")
public class PrinterController {

    private final PrinterService printerService;

    public PrinterController(PrinterService printerService) {
        this.printerService = printerService;
    }

    // create
    @PostMapping("/new")
    public Printer createPrinter(@ModelAttribute Printer printer) {
        return printerService.createPrinter(printer);
    }
    // read
    @GetMapping("/{id}")
    public Printer getPrinter(@PathVariable int id) {
        return printerService.getPrinter(id);
    }

    // read all
    @GetMapping("/all")
    public List<Printer> getAllPrinters() {
        return printerService.getAllPrinters();
    }

    // update
    @PutMapping("/{id}")
    public Printer updatePrinter(@PathVariable int id, @ModelAttribute Printer printer) {
        return printerService.updatePrinter(printer, id);
    }

    // delete
    @DeleteMapping("/{id}")
    public String deletePrinter(@PathVariable int id) {
        return printerService.deletePrinter(id);
    }

}
