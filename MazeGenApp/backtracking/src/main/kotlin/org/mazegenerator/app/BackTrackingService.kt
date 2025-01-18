package org.mazegenerator.app

import org.springframework.stereotype.Service

@Service
interface BackTrackingService {
    fun nextMove(vicini: List<Pair<Int, Int>>): Pair<Int, Int>?
}