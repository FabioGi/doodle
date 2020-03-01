//package fr.istic.sir.doodle.service;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import fr.istic.sir.doodle.dao.IuserRepository;
//import fr.istic.sir.doodle.entities.User;
//import fr.istic.sir.doodle.form.UserDTO;
//
//
//
//@Service
//public class JwtUserDetailsService implements UserDetailsService {
//	
//	@Autowired
//	private IuserRepository userDao;
//
//	@Autowired
//	private PasswordEncoder bcryptEncoder;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userDao.findByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("User not found with username: " + username);
//		}
//		return new org.springframework.security.core.userdetails.User(user.getPrenom(), user.getPassword(),
//				new ArrayList<>());
//	}
//	
//	public User save(UserDTO user) {
//		User newUser = new User();
//		newUser.setPrenom(user.getPrenom());
//		newUser.setNom(user.getNom());
//		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//		return userDao.save(newUser);
//	}
//}