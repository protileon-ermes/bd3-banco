package com.example.meusgastos.domain.dto.usuario;

public class LoginResponseDTO {
    public String token;
    private UsuarioResponseDTO usuario;

    public String getToken() {
        return token;
    }
    public UsuarioResponseDTO getUsuario() {
        return usuario;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public void setUsuario(UsuarioResponseDTO usuario) {
        this.usuario = usuario;
    }
}
