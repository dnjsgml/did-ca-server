/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.base.db.repository;

import org.omnione.did.base.db.domain.CertificateVc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for CertificateVc entity operations.
 * Provides CRUD operations for CertificateVc entities and custom query methods.
 *
 */
@Repository
public interface CertificateVcRepository extends JpaRepository<CertificateVc, Long> {
    /**
     * Finds the most recently created CertificateVc entity.
     *
     * @return An Optional containing the most recently created CertificateVc if found, or an empty Optional if not found.
     */
    Optional<CertificateVc> findFirstByOrderByCreatedAtDesc();
}
