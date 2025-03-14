package com.deepeshsingh19.user_profile_app.repository;

import com.deepeshsingh19.user_profile_app.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
