package com.lucas.telemedicina.service;

import com.lucas.telemedicina.entity.Paciente;
import com.lucas.telemedicina.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente atualizar(Long id, Paciente pacienteAtualizado) {
        return repository.findById(id)
                .map(paciente -> {
                    paciente.setNome(pacienteAtualizado.getNome());
                    paciente.setEmail(pacienteAtualizado.getEmail());
                    paciente.setTelefone(pacienteAtualizado.getTelefone());
                    paciente.setCpf(pacienteAtualizado.getCpf());

                    return repository.save(paciente);
                })
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}