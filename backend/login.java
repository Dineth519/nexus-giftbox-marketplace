@PostMapping("/login")
public String login(@RequestParam String username,
                    @RequestParam String password) {
    Optional<User> user = userRepository.findByUsernameAndPassword(username, password);

    if(user.isPresent()) {
        return "Login Successful";
    } else {
        return "Login Failed";
    }
}
