package br.com.solides.blogapi.service;

import br.com.solides.blogapi.model.User;
import br.com.solides.blogapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        // Verificar se o usuário já existe
        Optional<User> existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser.isPresent()) {
            // Lançar uma exceção ou retornar um resultado indicando que o usuário já existe
        }

        // Criptografar a senha antes de salvar
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Salvar o usuário no banco de dados
        return userRepository.save(user);
    }

    public String loginUser(User user) {
        // Lógica de autenticação aqui, gerar token JWT, etc.
        // Retornar o token gerado
        return null;
    }
}