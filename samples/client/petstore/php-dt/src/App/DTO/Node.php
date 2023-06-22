<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * dummy
 */
class Node
{
    /**
     * @DTA\Data(field="left", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Node::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Node::class})
     * @var \App\DTO\Node|null
     */
    public $left;

    /**
     * @DTA\Data(field="right", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Node::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Node::class})
     * @var \App\DTO\Node|null
     */
    public $right;

}
