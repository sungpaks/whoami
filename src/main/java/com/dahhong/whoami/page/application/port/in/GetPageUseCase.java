package com.dahhong.whoami.page.application.port.in;

import com.dahhong.whoami.page.domain.entity.Page;

import java.util.List;

public interface GetPageUseCase {
	Page getPage(Long id);

	List<Page> getAllPages();

	boolean checkPageOwnership(Long id, String userId);
}
