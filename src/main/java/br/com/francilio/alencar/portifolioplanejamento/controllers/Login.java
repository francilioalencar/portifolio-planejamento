package br.com.francilio.alencar.portifolioplanejamento.controllers;


import br.com.francilio.alencar.portifolioplanejamento.infra.security.TokenService;
import br.com.francilio.alencar.portifolioplanejamento.model.usuario.TokenDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.usuario.Usuario;
import br.com.francilio.alencar.portifolioplanejamento.model.usuario.UsuarioLogin;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")

public class Login {
    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid UsuarioLogin dados) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.ds_login(), dados.ds_senha());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

        System.out.println(tokenService.getSubject(tokenJWT));

        return ResponseEntity.ok(new TokenDTO( tokenJWT));
    }

}
