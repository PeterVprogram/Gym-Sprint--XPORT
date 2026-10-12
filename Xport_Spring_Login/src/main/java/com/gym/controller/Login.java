package com.gym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gym.model.Membresia;                      

import jakarta.servlet.http.HttpSession;                      

@Controller
public class Login {

    private static final List<Membresia> membresias = new ArrayList<>();

    // LOGIN
    @GetMapping({"/", "/login"})
    public String mostrarLogin() {
        return "index";
    }

    @PostMapping("/dashboard")
    public String procesarLogin(
            @RequestParam String usuario,
            @RequestParam String password,
            Model model) {

        model.addAttribute("usernameGuardado", usuario);

        if ("cliente@xport.com".equalsIgnoreCase(usuario) && "1234".equals(password)) {
            return "redirect:/ingreso";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos.");
            return "index";
        }
    }

    // MÓDULOS DEL DASHBOARD
    @GetMapping("/ingreso")
    public String ingreso() { return "ingreso"; }

    @GetMapping("/asistencia")
    public String asistencia() { return "asistencia"; }

    @GetMapping("/socios")
    public String socios() { return "socios"; }

    @GetMapping("/ventas")
    public String ventas() { return "ventas"; }

    @GetMapping("/productos")
    public String productos() { return "productos"; }

    @GetMapping("/gastos")
    public String gastos() { return "gastos"; }

    @GetMapping("/almacen")
    public String almacen() { return "almacen"; }

    
    // MÓDULO MEMBRESÍA
    @GetMapping("/membresia")
    public String membresia(Model model) {
        model.addAttribute("membresia", new Membresia());
        model.addAttribute("totalRegistros", membresias.size());
        return "membresia";
    }

    @PostMapping("/membresia/guardar")
    public String guardarMembresia(
            @ModelAttribute Membresia membresia,
            Model model) {

        if (membresia.getNroRegistro() == null || membresia.getNroRegistro().isEmpty()) {
            membresia.setNroRegistro(String.format("%08d", membresias.size() + 116));
        }

        if (membresia.getCondicion() == null || membresia.getCondicion().isEmpty()) {
            membresia.setCondicion("ACTIVA");
        }

        membresias.add(membresia);

        model.addAttribute("membresia", new Membresia());
        model.addAttribute("totalRegistros", membresias.size());
        model.addAttribute("mensaje", "¡Membresía guardada! Total registradas: " + membresias.size());

        return "membresia";
    }

    @GetMapping("/logout")
            public String cerrarSesion(HttpSession session) {
            session.invalidate();
    return "redirect:/login";
    }
}

