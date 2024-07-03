package com.example.bookstore.dao.entites;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.bookstore.dao.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User implements UserDetails {
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstname;
  private String lastname;
  @Column(unique = true,nullable = false)
  private String email;
  @Column(nullable = false)
  private String password;
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Role role;
  @Override
  
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return role.getAuthorities();
 }
 
  @Override
  public String getPassword() {
    return password;
 }
 
  @Override
  public String getUsername() {
    return email;
 }
 
  @Override
  public boolean isAccountNonExpired() {
    return true;
 }
 
  @Override
  public boolean isAccountNonLocked() {
    return true;
 }
 
  @Override
  public boolean isCredentialsNonExpired() {
    return true;
 }
 
  @Override
  public boolean isEnabled() {
    return true;
 }
 
}