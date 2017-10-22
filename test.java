

@RequestMapping(value = "/admin/users", method = RequestMethod.GET)
	public String getUsers(Locale locale, Model model) {
		List<User> users = userService.findAllEnabled();
		model.addAttribute("users", users);
		return "users";
	}
	
	@RequestMapping(value = { "/admin/students", "/coach/students" }, method = RequestMethod.GET)
	public String getStudents(Model model, HttpServletRequest request) {
		List<Student> students = studentService.findAllEnabled();
		model.addAttribute("students", students);
		String mapping = request.getServletPath();
		System.out.println(mapping);// "/admin/students"
		return mapping;
	}