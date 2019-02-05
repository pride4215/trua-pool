package burst.pool.storage.persistent;

import burst.kit.entity.BurstAddress;
import burst.pool.miners.Miner;
import burst.pool.miners.PoolFeeRecipient;
import burst.pool.pool.Submission;

import java.util.List;

public interface StorageService {
    int getMinerCount();
    List<Miner> getMiners();
    Miner getMiner(BurstAddress address);
    Miner newMiner(BurstAddress address);

    PoolFeeRecipient getPoolFeeRecipient();

    int getLastProcessedBlock();
    void incrementLastProcessedBlock();

    Submission getBestSubmissionForBlock(long blockHeight);
    void setOrUpdateBestSubmissionForBlock(long blockHeight, Submission submission);
}
