package com.thehandsome.app.service;

import com.thehandsome.app.dto.MemberDTO;

public interface MemberService {

	Long isdupluid(String uid);

	String joinEmail(String userMail);

	Long joinMember(MemberDTO memberDTO);

}
